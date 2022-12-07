(ns ogbe.fulcro.mui.icons.spoke
  #?(:cljs (:require
            ["@mui/icons-material/Spoke" :default Spoke]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spoke
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Spoke)))