(ns ogbe.fulcro.mui.icons.ramen-dining
  #?(:cljs (:require
            ["@mui/icons-material/RamenDining" :default RamenDining]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ramen-dining
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RamenDining)))