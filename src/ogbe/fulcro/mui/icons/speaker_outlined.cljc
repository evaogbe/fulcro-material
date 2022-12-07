(ns ogbe.fulcro.mui.icons.speaker-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerOutlined" :default SpeakerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerOutlined)))