(ns ogbe.fulcro.mui.icons.superscript
  #?(:cljs (:require
            ["@mui/icons-material/Superscript" :default Superscript]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-superscript
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Superscript)))