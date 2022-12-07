(ns ogbe.fulcro.mui.icons.museum
  #?(:cljs (:require
            ["@mui/icons-material/Museum" :default Museum]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-museum
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Museum)))