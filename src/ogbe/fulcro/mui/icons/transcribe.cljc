(ns ogbe.fulcro.mui.icons.transcribe
  #?(:cljs (:require
            ["@mui/icons-material/Transcribe" :default Transcribe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-transcribe
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Transcribe)))