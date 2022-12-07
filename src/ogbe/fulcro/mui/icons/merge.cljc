(ns ogbe.fulcro.mui.icons.merge
  #?(:cljs (:require
            ["@mui/icons-material/Merge" :default Merge]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-merge
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Merge)))