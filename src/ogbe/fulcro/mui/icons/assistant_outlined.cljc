(ns ogbe.fulcro.mui.icons.assistant-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AssistantOutlined" :default AssistantOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assistant-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssistantOutlined)))