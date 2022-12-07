(ns ogbe.fulcro.mui.icons.key-rounded
  #?(:cljs (:require
            ["@mui/icons-material/KeyRounded" :default KeyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-key-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyRounded)))