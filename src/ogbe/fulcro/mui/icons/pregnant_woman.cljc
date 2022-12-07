(ns ogbe.fulcro.mui.icons.pregnant-woman
  #?(:cljs (:require
            ["@mui/icons-material/PregnantWoman" :default PregnantWoman]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pregnant-woman
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PregnantWoman)))