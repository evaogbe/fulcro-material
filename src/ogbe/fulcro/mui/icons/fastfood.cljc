(ns ogbe.fulcro.mui.icons.fastfood
  #?(:cljs (:require
            ["@mui/icons-material/Fastfood" :default Fastfood]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fastfood
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fastfood)))