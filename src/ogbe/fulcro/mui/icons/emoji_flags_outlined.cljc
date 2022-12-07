(ns ogbe.fulcro.mui.icons.emoji-flags-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EmojiFlagsOutlined" :default EmojiFlagsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-flags-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiFlagsOutlined)))