(ns ogbe.fulcro.mui.icons.visibility-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VisibilityOutlined" :default VisibilityOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-visibility-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VisibilityOutlined)))