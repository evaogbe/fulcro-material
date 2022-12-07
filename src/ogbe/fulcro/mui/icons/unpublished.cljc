(ns ogbe.fulcro.mui.icons.unpublished
  #?(:cljs (:require
            ["@mui/icons-material/Unpublished" :default Unpublished]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-unpublished
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Unpublished)))