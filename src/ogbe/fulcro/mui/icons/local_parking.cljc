(ns ogbe.fulcro.mui.icons.local-parking
  #?(:cljs (:require
            ["@mui/icons-material/LocalParking" :default LocalParking]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-parking
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalParking)))