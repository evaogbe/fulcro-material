(ns ogbe.fulcro.mui.icons.mic-off
  #?(:cljs (:require
            ["@mui/icons-material/MicOff" :default MicOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mic-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MicOff)))