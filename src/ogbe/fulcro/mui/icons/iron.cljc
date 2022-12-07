(ns ogbe.fulcro.mui.icons.iron
  #?(:cljs (:require
            ["@mui/icons-material/Iron" :default Iron]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iron
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Iron)))