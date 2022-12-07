(ns ogbe.fulcro.mui.icons.pages
  #?(:cljs (:require
            ["@mui/icons-material/Pages" :default Pages]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pages
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pages)))