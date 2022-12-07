(ns ogbe.fulcro.mui.icons.assistant-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AssistantSharp" :default AssistantSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assistant-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssistantSharp)))