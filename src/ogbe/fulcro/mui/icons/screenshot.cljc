(ns ogbe.fulcro.mui.icons.screenshot
  #?(:cljs (:require
            ["@mui/icons-material/Screenshot" :default Screenshot]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screenshot
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Screenshot)))