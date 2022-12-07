(ns ogbe.fulcro.mui.icons.mic-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MicRounded" :default MicRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mic-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MicRounded)))