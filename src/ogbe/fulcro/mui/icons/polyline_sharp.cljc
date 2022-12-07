(ns ogbe.fulcro.mui.icons.polyline-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PolylineSharp" :default PolylineSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-polyline-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PolylineSharp)))