(ns ogbe.fulcro.mui.icons.transcribe-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TranscribeRounded" :default TranscribeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-transcribe-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TranscribeRounded)))