(ns ogbe.fulcro.mui.icons.science
  #?(:cljs (:require
            ["@mui/icons-material/Science" :default Science]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-science
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Science)))