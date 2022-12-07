(ns ogbe.fulcro.mui.icons.emoji-flags-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EmojiFlagsRounded" :default EmojiFlagsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-flags-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiFlagsRounded)))