(ns ogbe.fulcro.mui.icons.find-in-page
  #?(:cljs (:require
            ["@mui/icons-material/FindInPage" :default FindInPage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-find-in-page
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FindInPage)))