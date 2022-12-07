(ns ogbe.fulcro.mui.icons.border-outer
  #?(:cljs (:require
            ["@mui/icons-material/BorderOuter" :default BorderOuter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-outer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderOuter)))