(ns ogbe.fulcro.mui.icons.find-replace
  #?(:cljs (:require
            ["@mui/icons-material/FindReplace" :default FindReplace]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-find-replace
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FindReplace)))