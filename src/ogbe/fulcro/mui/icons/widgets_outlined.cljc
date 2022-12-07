(ns ogbe.fulcro.mui.icons.widgets-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WidgetsOutlined" :default WidgetsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-widgets-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WidgetsOutlined)))