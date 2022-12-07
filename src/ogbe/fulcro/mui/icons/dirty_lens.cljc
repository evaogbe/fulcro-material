(ns ogbe.fulcro.mui.icons.dirty-lens
  #?(:cljs (:require
            ["@mui/icons-material/DirtyLens" :default DirtyLens]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dirty-lens
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirtyLens)))