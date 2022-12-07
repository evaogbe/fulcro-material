(ns ogbe.fulcro.mui.icons.local-hotel
  #?(:cljs (:require
            ["@mui/icons-material/LocalHotel" :default LocalHotel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-hotel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalHotel)))