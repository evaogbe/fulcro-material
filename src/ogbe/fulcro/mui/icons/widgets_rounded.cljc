(ns ogbe.fulcro.mui.icons.widgets-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WidgetsRounded" :default WidgetsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-widgets-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WidgetsRounded)))