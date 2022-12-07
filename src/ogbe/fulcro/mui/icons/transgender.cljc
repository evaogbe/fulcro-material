(ns ogbe.fulcro.mui.icons.transgender
  #?(:cljs (:require
            ["@mui/icons-material/Transgender" :default Transgender]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-transgender
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Transgender)))