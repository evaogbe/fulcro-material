(ns ogbe.fulcro.mui.icons.polyline-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PolylineOutlined" :default PolylineOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-polyline-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PolylineOutlined)))