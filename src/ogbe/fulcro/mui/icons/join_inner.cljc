(ns ogbe.fulcro.mui.icons.join-inner
  #?(:cljs (:require
            ["@mui/icons-material/JoinInner" :default JoinInner]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-join-inner
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JoinInner)))