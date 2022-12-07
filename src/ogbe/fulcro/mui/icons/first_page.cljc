(ns ogbe.fulcro.mui.icons.first-page
  #?(:cljs (:require
            ["@mui/icons-material/FirstPage" :default FirstPage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-first-page
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FirstPage)))