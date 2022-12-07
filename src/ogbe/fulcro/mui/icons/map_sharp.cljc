(ns ogbe.fulcro.mui.icons.map-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MapSharp" :default MapSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-map-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MapSharp)))