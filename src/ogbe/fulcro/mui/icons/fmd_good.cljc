(ns ogbe.fulcro.mui.icons.fmd-good
  #?(:cljs (:require
            ["@mui/icons-material/FmdGood" :default FmdGood]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fmd-good
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FmdGood)))