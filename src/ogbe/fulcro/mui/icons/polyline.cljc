(ns ogbe.fulcro.mui.icons.polyline
  #?(:cljs (:require
            ["@mui/icons-material/Polyline" :default Polyline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-polyline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Polyline)))