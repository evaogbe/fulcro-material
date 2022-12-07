(ns ogbe.fulcro.mui.icons.hotel
  #?(:cljs (:require
            ["@mui/icons-material/Hotel" :default Hotel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hotel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hotel)))