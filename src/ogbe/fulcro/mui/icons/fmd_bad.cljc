(ns ogbe.fulcro.mui.icons.fmd-bad
  #?(:cljs (:require
            ["@mui/icons-material/FmdBad" :default FmdBad]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fmd-bad
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FmdBad)))