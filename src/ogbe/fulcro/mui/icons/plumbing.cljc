(ns ogbe.fulcro.mui.icons.plumbing
  #?(:cljs (:require
            ["@mui/icons-material/Plumbing" :default Plumbing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plumbing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Plumbing)))