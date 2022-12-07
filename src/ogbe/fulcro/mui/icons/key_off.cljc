(ns ogbe.fulcro.mui.icons.key-off
  #?(:cljs (:require
            ["@mui/icons-material/KeyOff" :default KeyOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-key-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyOff)))