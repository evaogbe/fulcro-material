(ns ogbe.fulcro.mui.icons.mic-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MicSharp" :default MicSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mic-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MicSharp)))