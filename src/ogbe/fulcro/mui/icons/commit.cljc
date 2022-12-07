(ns ogbe.fulcro.mui.icons.commit
  #?(:cljs (:require
            ["@mui/icons-material/Commit" :default Commit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-commit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Commit)))