(ns ogbe.fulcro.mui.icons.emoji-flags-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EmojiFlagsSharp" :default EmojiFlagsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-flags-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiFlagsSharp)))