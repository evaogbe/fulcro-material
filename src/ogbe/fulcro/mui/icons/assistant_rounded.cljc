(ns ogbe.fulcro.mui.icons.assistant-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AssistantRounded" :default AssistantRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assistant-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssistantRounded)))