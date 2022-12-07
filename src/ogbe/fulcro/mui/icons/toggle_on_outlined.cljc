(ns ogbe.fulcro.mui.icons.toggle-on-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ToggleOnOutlined" :default ToggleOnOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toggle-on-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToggleOnOutlined)))