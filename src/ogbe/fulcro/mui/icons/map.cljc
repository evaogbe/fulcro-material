(ns ogbe.fulcro.mui.icons.map
  #?(:cljs (:require
            ["@mui/icons-material/Map" :default Map]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-map
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Map)))