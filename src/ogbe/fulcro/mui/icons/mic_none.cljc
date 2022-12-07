(ns ogbe.fulcro.mui.icons.mic-none
  #?(:cljs (:require
            ["@mui/icons-material/MicNone" :default MicNone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mic-none
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MicNone)))