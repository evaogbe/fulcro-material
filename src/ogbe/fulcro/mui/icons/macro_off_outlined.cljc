(ns ogbe.fulcro.mui.icons.macro-off-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MacroOffOutlined" :default MacroOffOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-macro-off-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MacroOffOutlined)))