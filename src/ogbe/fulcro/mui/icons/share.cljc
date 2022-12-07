(ns ogbe.fulcro.mui.icons.share
  #?(:cljs (:require
            ["@mui/icons-material/Share" :default Share]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-share
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Share)))