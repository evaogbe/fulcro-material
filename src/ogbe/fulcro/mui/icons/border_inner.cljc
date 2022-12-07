(ns ogbe.fulcro.mui.icons.border-inner
  #?(:cljs (:require
            ["@mui/icons-material/BorderInner" :default BorderInner]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-inner
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderInner)))