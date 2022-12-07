(ns ogbe.fulcro.mui.icons.assistant-photo
  #?(:cljs (:require
            ["@mui/icons-material/AssistantPhoto" :default AssistantPhoto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assistant-photo
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssistantPhoto)))