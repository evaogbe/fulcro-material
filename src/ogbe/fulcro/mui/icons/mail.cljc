(ns ogbe.fulcro.mui.icons.mail
  #?(:cljs (:require
            ["@mui/icons-material/Mail" :default Mail]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mail)))